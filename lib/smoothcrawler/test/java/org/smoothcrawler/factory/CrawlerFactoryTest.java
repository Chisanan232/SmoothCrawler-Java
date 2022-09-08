package org.smoothcrawler.factory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.smoothcrawler.component.data.BaseDataHandler;
import org.smoothcrawler.component.data.BaseHttpResponseParser;
import org.smoothcrawler.component.http.BaseHttpRequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class CrawlerFactoryTest {

    private CrawlerFactory crawlerFactory;
    private BaseHttpRequest httpRequest;
    private BaseHttpResponseParser httpResponseParser;
    private BaseDataHandler dataHandler;

    @BeforeEach void setup() {
        crawlerFactory = new CrawlerFactory();
        httpRequest = mock(BaseHttpRequest.class);
        httpResponseParser = mock(BaseHttpResponseParser.class);
        dataHandler = mock(BaseDataHandler.class);
    }

    @Test
    public void testHttpRequest() {
        assertThat(crawlerFactory.getHttpRequest()).isNull();
        crawlerFactory.setHttpRequest(httpRequest);
        assertThat(crawlerFactory.getHttpRequest()).isNotNull();
        assertThat(crawlerFactory.getHttpRequest()).isEqualTo(httpRequest);
    }

    @Test
    public void testHttpResponseParser() {
        assertThat(crawlerFactory.getHttpResponseParser()).isNull();
        crawlerFactory.setHttpResponseParser(httpResponseParser);
        assertThat(crawlerFactory.getHttpResponseParser()).isNotNull();
        assertThat(crawlerFactory.getHttpResponseParser()).isEqualTo(httpResponseParser);
    }

    @Test
    public void testDataHandler() {
        assertThat(crawlerFactory.getDataHandler()).isNull();
        crawlerFactory.setDataHandler(dataHandler);
        assertThat(crawlerFactory.getDataHandler()).isNotNull();
        assertThat(crawlerFactory.getDataHandler()).isEqualTo(dataHandler);
    }

}
