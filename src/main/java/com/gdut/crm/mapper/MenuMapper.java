package com.gdut.crm.mapper;

import com.gdut.crm.pojo.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MenuMapper{
    String field = " id,name,parent_name,parent_id,menu_sort,menu_type,path,hidden,state,icon,perms,create_time,modify_time ";
    @Select("<script>" +
            "select id, name, parent_name, parent_id, menu_sort, menu_type, path, hidden, state, icon, perms, create_time, modify_time \n" +
            "        from t_menu \n" +
            "        where del_flag = '0' \n" +
            "        <if test=\"perms != null and perms != ''\">\n" +
            "            and perms = #{perms}\n" +
            "        </if>\n" +
            "        <if test=\"userId != null and userId != ''\">\n" +
            "            and id in (\n" +
            "                select menu_id from t_role_menu where role_id in (\n" +
            "                    select role_id from t_user_role where user_id = #{userId}\n" +
            "                )\n" +
            "            )\n" +
            "        </if>\n" +
            "        order by menu_sort" +
            "</script>"
            )
    @Results(id = "map",value = {
            @Result (column="id",property ="id" ),
            @Result (column="name",property ="name" ),
            @Result (column="parent_name",property ="parentName" ),
            @Result (column="parent_id",property ="parentId" ),
            @Result (column="menu_sort",property ="menuSort" ),
            @Result (column="menu_type",property ="menuType" ),
            @Result (column="path",property ="path" ),
            @Result (column="hidden",property ="hidden" ),
            @Result (column="state",property ="state" ),
            @Result (column="icon",property ="icon" ),
            @Result (column="perms",property ="perms" ),
            @Result (column="create_time",property ="createTime" ),
            @Result (column="modify_time",property ="modifyTime" ),
            @Result (column="del_flag",property ="delFlag" )
    })
    List<Menu> selectMenusByUserId(@Param("userId")String userId,@Param("perms")String perms);
    @Select("<script>" +
            "select id, name, parent_name, parent_id, menu_sort, menu_type, path, hidden, state, icon, perms, create_time, modify_time \n" +
            "        from t_menu \n" +
            "        where del_flag = '0' \n" +
            "<if test=\"pagingData\">" +
            "limit #{start},#{pageSize}" +
            "</if>" +
            "</script>"
    )
    @ResultMap("map")
    List<Menu> selectMenus(boolean pagingData, @Param("start") Integer start,@Param("pageSize") Integer pageSize);

    @Select("select count(id) from t_menu")
    long count();
}
