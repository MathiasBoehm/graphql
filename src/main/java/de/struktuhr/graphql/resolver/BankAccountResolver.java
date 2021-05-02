package de.struktuhr.graphql.resolver;

import de.struktuhr.graphql.domain.bank.BankAccount;
import de.struktuhr.graphql.domain.bank.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    // a4189999-72b0-4eb1-a25d-cb0c4898d2d1
    public BankAccount bankAccount(UUID id) {
        log.info("get bankAccount {}", id);

        return BankAccount.builder()
                .id(id)
                .name("Mathias")
                .currency(Currency.EUR)
                .build();
    }
}
