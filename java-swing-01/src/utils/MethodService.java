package utils;

import java.util.List;

public interface MethodService<EntityType, KeyType> {

    List<EntityType> selectBySQL(String sql, Object... args);

    List<EntityType> getAll();
    
    List<EntityType> getFromTo(int start, int end);

    EntityType getByID(KeyType id);

    void add(EntityType o);

    void update(EntityType o);

    void remove(KeyType id);
}
