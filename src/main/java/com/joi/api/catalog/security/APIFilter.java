/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.catalog.security;

import com.joi.api.catalog.dto.CategoryDTO;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

/**
 *
 * @author Ramy
 */
@Component
public class APIFilter implements Filter {

    @Override
    public void init(FilterConfig fc) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) sr;

        if (httpRequest.getHeader("LanguageId") == null || httpRequest.getHeader("StoreId") == null) {
            ((HttpServletResponse) sr1)
                    .setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }else{
        fc.doFilter(sr, sr1);
        }
    }

    @Override
    public void destroy() {

    }

}
