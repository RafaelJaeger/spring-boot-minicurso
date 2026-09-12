package br.com.jaeger.spring_boot_essentials.database.repository;

import br.com.jaeger.spring_boot_essentials.database.model.AlunosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlunosRepository extends JpaRepository<AlunosEntity, Integer> {
}
