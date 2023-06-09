package ftn.uns.ac.rs.bloodBank.service;

import ftn.uns.ac.rs.bloodBank.model.SlobodanTermin;
import lombok.SneakyThrows;

import java.util.List;

public interface SlobodanTerminService {
    SlobodanTermin save(SlobodanTermin slobodanTermin);
    List<SlobodanTermin> findAll();

    @SneakyThrows
    Boolean isAvailable(String date, String time, Integer duration);

    SlobodanTermin findById(Long id);

    void setReservation(SlobodanTermin slobodanTermin);

    List<SlobodanTermin> findAllByReservated(boolean isReservated);
}
