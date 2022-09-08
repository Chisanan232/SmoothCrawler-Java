package org.smoothcrawler.factory;

import org.smoothcrawler.component.data.BaseDataHandler;
import org.smoothcrawler.component.data.BaseHttpResponseParser;
import org.smoothcrawler.component.http.BaseHttpRequest;

public class CrawlerFactory implements BaseFactory {

    private BaseHttpRequest httpRequest = null;
    private BaseHttpResponseParser httpResponseParser = null;
    private BaseDataHandler dataHandler = null;

    @Override
    public BaseHttpRequest getHttpRequest() {
        return this.httpRequest;
    }

    @Override
    public void setHttpRequest(BaseHttpRequest httpRequest) {
        this.httpRequest = httpRequest;
    }

    @Override
    public BaseHttpResponseParser getHttpResponseParser() {
        return this.httpResponseParser;
    }

    @Override
    public void setHttpResponseParser(BaseHttpResponseParser httpResponseParser) {
        this.httpResponseParser = httpResponseParser;
    }

    @Override
    public BaseDataHandler getDataHandler() {
        return this.dataHandler;
    }

    @Override
    public void setDataHandler(BaseDataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }

}
