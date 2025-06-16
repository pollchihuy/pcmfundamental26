package com.juaracoding.pcmfundamental.unittest.core;

import java.util.List;

public interface IService<T> {

    public String insert(T t);//001-010
    public String update(Long id, T t);//011-020
    public String delete(Long id);//021-030
    public T find(Long id);//031-040
    public List<T> findAll();//041-050
}
