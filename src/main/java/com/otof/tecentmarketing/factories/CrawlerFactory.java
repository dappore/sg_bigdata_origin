package com.otof.tecentmarketing.factories;

import com.otof.tecentmarketing.services.WebCrawlerService;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class CrawlerFactory implements CrawlController.WebCrawlerFactory {

    private WebCrawlerService webCrawlerService = new WebCrawlerService();

    public WebCrawlerService newInstance() {
        return webCrawlerService;
    }
}
