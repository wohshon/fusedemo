/*
 * Copyright 2016 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package com.redhat;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

/**
 * A sample transform
 */
@Component(value = "myTransformer")
public class MyTransformer {

    public String transform(Exchange e) {
    	String j=new String((byte[])e.getIn().getBody());
    	System.out.println("*****"+j);
    	Gson gson = new Gson();
    	e.getIn().setHeader(Exchange.CONTENT_TYPE, "text/plain");

    	return new String(j);
    }

}
