package Database;

import java.util.List;

public interface CRUD {
    // Hacemos el crud interface lo mas generico posible para que se pueda implementar en cualquier clase
    // Siempre que implementemos estos metodos hay que castear (recuerda que castear es convertir) al tipo de dato que necesitemos
    public Object insert(Object obj);
    public List<Object> findAll();
    public boolean update(Object obj);
    public boolean delete(Object obj);
}
