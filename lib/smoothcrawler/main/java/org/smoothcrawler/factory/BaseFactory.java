package org.smoothcrawler.factory;

import org.smoothcrawler.component.data.BaseDataHandler;
import org.smoothcrawler.component.data.BaseHttpResponseParser;
import org.smoothcrawler.component.http.BaseHttpRequest;

public interface BaseFactory {

    abstract public BaseHttpRequest getHttpRequest();

    abstract public void setHttpRequest(BaseHttpRequest httpRequest);

    abstract public BaseHttpResponseParser getHttpResponseParser();

    abstract public void setHttpResponseParser(BaseHttpResponseParser baseHttpResponseParser);

    abstract public BaseDataHandler getDataHandler();

    abstract public void setDataHandler(BaseDataHandler dataHandler);

}
