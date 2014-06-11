package compiere.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import compiere.domain.model.Thingy;
import compiere.domain.repository.GenericRepository;

import javax.annotation.Resource;

@Service
@Transactional
public class ThingyCRUDService implements CRUDService<Thingy> {

    @Resource(name = "thingyRepository")
    private GenericRepository<Thingy> repository;

    @Override
    public Thingy create(Thingy object) {
        return repository.save(object);
    }

    @Override
    public Thingy retrieve(int id) {
        return repository.get(id);
    }
}
