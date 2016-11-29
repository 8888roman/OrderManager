package pl.trinitec.repository;

import org.springframework.data.repository.CrudRepository;
import pl.trinitec.domain.Supplier;

import java.util.List;

/**
 * Created by AN-KOP on 2016-11-19.
 */
public interface SupplierRepository extends CrudRepository<Supplier, Long> {
    List<Supplier> findById (Long id);

}
