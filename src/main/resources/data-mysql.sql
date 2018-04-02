#
# TABLE STRUCTURE FOR: category
#

DROP TABLE IF EXISTS category;

CREATE TABLE `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO category (`id`, `description`, `name`) VALUES (1, 'Temporibus velit perferendis iure quis cum et. Voluptatem eius illo quia odio. Beatae tenetur rem incidunt at rerum non nulla.', 'Mobilní telefony');
INSERT INTO category (`id`, `description`, `name`) VALUES (2, 'Error necessitatibus consequatur laboriosam tempora. Qui quia eligendi nisi culpa et provident est qui. Blanditiis veritatis ipsum non facilis adipisci qui. Possimus voluptatibus ut aut ducimus quisquam soluta.', 'Tablety');
INSERT INTO category (`id`, `description`, `name`) VALUES (3, 'Temporibus velit perferendis iure quis cum et. Voluptatem eius illo quia odio. Beatae tenetur rem incidunt at rerum non nulla.', 'TV');

#
# TABLE STRUCTURE FOR: product
#

DROP TABLE IF EXISTS product;

CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` longtext NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` decimal(12,2) NOT NULL,
  `product_image_url` varchar(255) DEFAULT NULL,
  `quantity` bigint(20) NOT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1mtsbur82frn64de7balymq9s` (`category_id`),
  CONSTRAINT `FK1mtsbur82frn64de7balymq9s` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (1, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', 'Iphone SE 64 GB', '9995', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 1);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (2, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', 'Sony Xperia Z5', '15490', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 1);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (3, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', 'Honor8', '6775', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 1);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (4, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', 'Samsung S8 64 GB', '22390', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 1);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (5, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', 'Ipad 4 Mini 16 GB', '8490', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 2);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (6, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', 'Samsung Galaxy TAB 8', '17500', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 2);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (7, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', 'Evolveo 10T', '3690', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 2);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (8, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', 'Lenovo TAB 8', '3990', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 2);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (9, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', '40" Samsung UE40MU6452', '5750', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 3);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (10, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', '43" LG 43UJ6307', '12490', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 3);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (11, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', '32" Samsung UE32M5002', '22500', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 3);
INSERT INTO product (`id`, `description`, `name`, `price`, `product_image_url`, `quantity`, `category_id`) VALUES (12, 'Odio velit voluptatum alias cupiditate voluptatem amet. Quis doloremque optio unde libero placeat. Velit natus est voluptas accusamus.', '32" Thomson 32HB5426', '11155', 'tmp//6f147f8c1a769272ad09ddbb822188db.jpg', 10, 3);