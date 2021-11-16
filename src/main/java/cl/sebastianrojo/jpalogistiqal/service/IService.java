package cl.sebastianrojo.jpalogistiqal.service;

/**
 * IService
 */
public interface IService<EntityVO, Entity> {

    public EntityVO findAll();
    public EntityVO findById(Object id);
    public EntityVO insert(Entity entity);
    public EntityVO update(Entity entity);
    public EntityVO delete(Entity entity);
      
}