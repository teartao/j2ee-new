package com.tao.entity;

import java.util.Date;
import java.util.List;

/**
 * @Author neotao
 * @Date 2018/5/18
 * @Version V0.0.1
 * @Desc 菜单
 */
public class Menu {
    private Long id;
    private String title;
    private Long createrId;
    private Date createTime;

    private User creater;
    private List<MenuSelection> selectionList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Long createrId) {
        this.createrId = createrId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getCreater() {
        return creater;
    }

    public void setCreater(User creater) {
        this.creater = creater;
    }

    public List<MenuSelection> getSelectionList() {
        return selectionList;
    }

    public void setSelectionList(List<MenuSelection> selectionList) {
        this.selectionList = selectionList;
    }
}
