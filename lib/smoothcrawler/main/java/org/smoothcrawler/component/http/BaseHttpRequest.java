package org.smoothcrawler.component.http;

public interface BaseHttpRequest {

    abstract public <T> T request(String url);

}
