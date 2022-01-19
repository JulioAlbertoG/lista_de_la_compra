package com.example.listadelacompra;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProductoDao {
    @Query("SELECT * FROM proucts")
    List<Producto> getProductos();

}
