package com.rest.model;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Client {
    @NotBlank
    private Long clientId;
    @NotBlank
    @Size(min = 1, max = 255)
    private String clientName;
    @NotBlank
    @Size(min = 1, max = 50)
    private String tariff;
    @NotBlank
    private Integer balance;
}
