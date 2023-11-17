package cat.politecnicllevant.demo;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
@WebFilter(filterName = "provaFilter", urlPatterns = "/hello-servlet")
public class ProvaFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //filter es el patro chain of responsibility
        System.out.println("filtre");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
