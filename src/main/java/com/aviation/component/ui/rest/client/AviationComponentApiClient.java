package com.aviation.component.ui.rest.client;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aviation.component.ui.vo.ComponentReport;

@FeignClient("aviation-component-api")
public interface AviationComponentApiClient {
	
	
	@RequestMapping(value = "/removalReport", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ComponentReport getRemovalReport(@RequestParam("componentIdList") List<Long> componentIdlist);

}
