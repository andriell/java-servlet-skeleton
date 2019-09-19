CREATE TABLE `bank`
(
    `id`   INT(6)       NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(255) NOT NULL DEFAULT '0',
    PRIMARY KEY (`id`)
)
COLLATE = 'utf8_general_ci'
ENGINE = InnoDB;

CREATE TABLE `client`
(
    `id`           INT(6)       NOT NULL AUTO_INCREMENT,
    `first_name`   VARCHAR(255) NULL DEFAULT NULL,
    `last_name`    VARCHAR(255) NULL DEFAULT NULL,
    `phone_number` VARCHAR(255) NULL DEFAULT NULL,
    `address`      VARCHAR(255) NULL DEFAULT NULL,
    `email`        VARCHAR(255) NULL DEFAULT NULL,
    `bank_id`      INT(6)       NULL DEFAULT NULL,
    PRIMARY KEY (`id`),
    INDEX `FK_client_bank` (`bank_id`),
    CONSTRAINT `FK_client_bank` FOREIGN KEY (`bank_id`) REFERENCES `bank` (`id`) ON UPDATE CASCADE ON DELETE SET NULL
)
    COLLATE = 'utf8_general_ci'
    ENGINE = InnoDB;

CREATE TABLE `bank_account`
(
    `id`               INT(6) NOT NULL AUTO_INCREMENT,
    `currency`         DOUBLE NOT NULL DEFAULT 0,
    `amount`           DOUBLE NOT NULL DEFAULT 0,
    `amount_of_credit` DOUBLE NOT NULL DEFAULT 0,
    `client_id`        INT(6) NULL     DEFAULT NULL,
    PRIMARY KEY (`id`),
    INDEX `FK_bank_account_client` (`client_id`),
    CONSTRAINT `FK_bank_account_client` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`) ON UPDATE CASCADE ON DELETE SET NULL
)
COLLATE = 'utf8_general_ci'
ENGINE = InnoDB;

CREATE TABLE `worker`
(
    `id`           INT(6)       NOT NULL AUTO_INCREMENT,
    `first_name`   VARCHAR(255) NULL DEFAULT NULL,
    `last_name`    VARCHAR(255) NULL DEFAULT NULL,
    `status`       VARCHAR(255) NULL DEFAULT NULL,
    `phone_number` VARCHAR(255) NULL DEFAULT NULL,
    `bank_id`      INT(6)       NULL DEFAULT NULL,
    PRIMARY KEY (`id`),
    INDEX `FK_worker_bank` (`bank_id`),
    CONSTRAINT `FK_worker_bank` FOREIGN KEY (`bank_id`) REFERENCES `bank` (`id`) ON UPDATE CASCADE ON DELETE SET NULL
)
COLLATE = 'utf8_general_ci'
ENGINE = InnoDB;
