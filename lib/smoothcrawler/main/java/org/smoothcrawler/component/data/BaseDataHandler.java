package org.smoothcrawler.component.data;

public interface BaseDataHandler {

    abstract public <T> T process(T parsedData);

}
