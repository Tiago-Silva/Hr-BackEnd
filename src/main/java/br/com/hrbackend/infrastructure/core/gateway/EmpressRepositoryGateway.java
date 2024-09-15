package br.com.hrbackend.infrastructure.core.gateway;

import br.com.hrbackend.application.gateway.EmpressGateway;
import br.com.hrbackend.domain.entity.Empress;
import br.com.hrbackend.infrastructure.core.mapper.EmpressMapper;
import br.com.hrbackend.infrastructure.data.repository.EmpressRepository;

import java.util.List;

public class EmpressRepositoryGateway implements EmpressGateway {

    private final EmpressRepository repository;
    private final EmpressMapper mapper;
    public EmpressRepositoryGateway(EmpressRepository repository, EmpressMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void createEmpress(Empress empressDomain) {
        this.repository.save(this.mapper.toEmpressDB(empressDomain));
    }

    @Override
    public void updateEmpress(Empress empressDomain) {
        this.repository.update(this.mapper.toEmpressDB(empressDomain));
    }

    @Override
    public void deleteEmpress(Empress empressDomain) {
        this.repository.delete(this.mapper.toEmpressDB(empressDomain));
    }

    @Override
    public List<Empress> getAllEmpress() {
        return this.repository.getAllEmpress().stream().map(this.mapper::toEmpress).toList();
    }

    @Override
    public Empress getEmpressById(int id) {
        return this.mapper.toEmpress(this.repository.getEmpressById(id));
    }

    @Override
    public List<Empress> getEmpressController() {
        return this.repository.getEmpressControllers().stream().map(this.mapper::toEmpress).toList();
    }

    @Override
    public List<Empress> getEmpressFilial() {
        return this.repository.getFiliais().stream().map(this.mapper::toEmpress).toList();
    }
}
