package com.ctgu.mapper;


import com.ctgu.entity.Category;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryMapper {

    @Select("SELECT * FROM `categories` WHERE id IN(SELECT `cid` FROM `movie-category` WHERE `mid`= #{mid})")
    List<Category> getAllByMovieId(@Param("mid") Long mid);

    @Select("SELECT * FROM `categories` WHERE `id` = #{id}")
    Category getById(@Param("id") int id);
}