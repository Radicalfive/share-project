package top.radical.content.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.radical.content.domain.entity.Share;

/**
 * @description:
 * @author: radical
 * @create: 2022-09-06
 **/

public interface ShareRepository extends JpaRepository<Share, Integer> {
}
