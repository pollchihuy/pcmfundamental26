package com.juaracoding.pcmfundamental.oop.contohgeneric;

import java.util.List;

public interface IService<T> {
    public void insert(T t);//001-010
    public void update(Long id, T t);//011-020
    public void delete(Long id);//021-030
    public T find(Long id);//031-040
    public List<T> findAll();//041-050
}