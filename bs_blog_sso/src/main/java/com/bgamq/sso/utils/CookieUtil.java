package com.bgamq.sso.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {

    /**
     * cookie共享sso访问路径下
     */
    public static final String COOKIE_PATH = "/sso";


    /**
     * 查询
     * @param request
     * @param key 键
     * @return
     */
    public static String lookupCookie(HttpServletRequest request, String key) {
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                if (key.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    /**
     * 添加
     * @param response
     * @param key 键
     * @param value 值
     * @param maxAge 失效时间
     */
    public static void createCookie(HttpServletResponse response, String key, String value, Integer maxAge) {
        Cookie cookie = new Cookie(key, value);
        cookie.setMaxAge(maxAge == null ? -1 : maxAge);
        cookie.setPath(COOKIE_PATH);
        response.addCookie(cookie);
    }

    /**
     * 更新
     * @param request
     * @param response
     * @param key 键
     * @param value 值
     * @param maxAge 失效时间
     */
    public static void refreshCookie(HttpServletRequest request, HttpServletResponse response, String key, String value, Integer maxAge) {
        removeCookie(response, key);
        createCookie(response, key, value, maxAge);
    }

    /**
     * 删除
     * @param response
     * @param key 键
     */
    public static void removeCookie(HttpServletResponse response, String key) {
        javax.servlet.http.Cookie cookie = new Cookie(key, null);
        cookie.setMaxAge(0);
        cookie.setPath(COOKIE_PATH);
        response.addCookie(cookie);
    }
}
