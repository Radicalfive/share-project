package top.radical.notice.service;

import top.radical.notice.entity.Notice;

/**
 * @description:
 * @author: radical
 * @create: 2022-09-25
 **/

public interface NoticeService {
    /**
     * 获取最新通知
     *
     * @return notice
     */
    Notice getLatestNotice();
}

