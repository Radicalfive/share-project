package top.radical.content.service;

import top.radical.content.domain.entity.Share;

import java.util.List;

/**
 * @description:
 * @author: radical
 * @create: 2022-09-06
 **/

public interface ShareService {
    /**
     * @param id id
     * @return share
     */
    //Share findById(Integer id);

    List<Share> findAll();
}
