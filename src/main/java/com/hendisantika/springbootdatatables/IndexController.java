package com.hendisantika.springbootdatatables;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-datatables
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/08/18
 * Time: 07.09
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    String index() {
        return "index";
    }

    @GetMapping("with-post")
    String withPost() {
        return "with-post";
    }

    @GetMapping("advanced")
    String advanced() {
        return "advanced";
    }

    @GetMapping("scroller")
    String scroller() {
        return "scroller";
    }
}
