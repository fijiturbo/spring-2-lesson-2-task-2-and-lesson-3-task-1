package uz.pdp.spring2lesson2task2andlesson3task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.spring2lesson2task2andlesson3task1.entity.Invoice;
import uz.pdp.spring2lesson2task2andlesson3task1.projection.CustomInvoice;

@RepositoryRestResource(path = "invoice", collectionResourceRel = "invoiceList", excerptProjection = CustomInvoice.class)
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
