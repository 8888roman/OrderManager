package pl.trinitec.repository;

import org.springframework.data.repository.CrudRepository;
import pl.trinitec.domain.Address;
import pl.trinitec.domain.PartOrder;

import java.util.List;

/**
 * Created by AN-KOP on 2016-11-19.
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
    List<Address> findById(Long id);

}
