package org.smoothcrawler.component.data;

public interface BaseHttpResponseParser {

    abstract public <T> T parseContent(T response);

}
