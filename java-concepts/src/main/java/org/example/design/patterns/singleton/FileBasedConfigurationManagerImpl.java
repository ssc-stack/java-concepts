package org.example.design.patterns.singleton;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManager fileBasedConfigurationManager;

    private FileBasedConfigurationManagerImpl() {

    }

    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String value=properties.getProperty(key);
        if(value==null) return null;
        return convert(value,type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        if(value instanceof String)
            properties.setProperty(key,(String)value);
        else
            properties.setProperty(key,String.valueOf(value));
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {
        // TODO Auto-generated method stub
        if(fileBasedConfigurationManager==null) {
            fileBasedConfigurationManager=new FileBasedConfigurationManagerImpl();
        }

        return fileBasedConfigurationManager;

    }

    public static void resetInstance() {
        fileBasedConfigurationManager=null;
    }

}