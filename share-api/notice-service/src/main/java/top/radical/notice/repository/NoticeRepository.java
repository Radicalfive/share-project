package top.radical.notice.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import top.radical.notice.entity.Notice;

import java.util.List;

/**
 * @description:
 * @author: radical
 * @create: 2022-09-25
 **/

public interface NoticeRepository extends JpaRepository<Notice, Integer> {
    /**
     * 根据类型提交查询，根据日期排序
     *
     * @param showFlag
     * @param sort
     * @return
     */
    List<Notice> findByShowFlag(Boolean showFlag, Sort sort);
}
