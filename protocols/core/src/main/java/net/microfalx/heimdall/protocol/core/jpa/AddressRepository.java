package net.microfalx.heimdall.protocol.core.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>, JpaSpecificationExecutor<Address> {

    /**
     * Returns the address by value.
     *
     * @param value the address value
     * @return the address if exists, otherwise returns null
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    Address findByValue(String value);
}
