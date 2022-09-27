package top.radical.notice.service.impl;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import top.radical.notice.entity.Notice;
import top.radical.notice.repository.NoticeRepository;
import top.radical.notice.service.NoticeService;

import javax.annotation.Resource;

/**
 * @description:
 * @author: radical
 * @create: 2022-09-25
 **/

@Service
public class NoticeServiceImpl implements NoticeService {
    @Resource
    private NoticeRepository noticeRepository;

    @Override
    public Notice getLatestNotice() {
        Sort sort = Sort.by("createTime").descending();
        return noticeRepository.findByShowFlag(true, sort).get(0);
    }
}
