package br.com.springboot.dao;

import java.util.List;

public interface CRUD <T, ID>
{
	T pesquisaPeloId(ID id);
	List<T> Lista();
	void insere (T t);
	void atualiza (T t);
	void remove (T t);	
}
