package com.inshare.dubbo.common;

/**
 * @author Guichao
 * @since 2018/9/23
 */
public interface BaseService<T> {

    /**
     * 新增记录
     * @param t
     * @return
     */
    public ResponseResult<Integer> create(T t);

    /**
     * 根据主键删除
     * @param pk
     * @return
     */
    public ResponseResult<Integer> delete(Long pk);

    /**
     * 根据主键更新记录
     * @param t
     * @return
     */
    public ResponseResult<Integer> update(T t);

    /**
     * 根据主键查询
     * @param pk
     * @return
     */
    public ResponseResult<T> get(Long pk);

}
