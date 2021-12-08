package com.qsl.projectdemo.common.model;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果集
 *
 * @author DanielQSL
 */
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private Integer pageNum;

    /**
     * 每页的数量
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 总记录数
     */
    private Long total;

    /**
     * 结果集
     */
    private List<T> list;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalPage=" + totalPage +
                ", total=" + total +
                ", list=" + list +
                '}';
    }

}
