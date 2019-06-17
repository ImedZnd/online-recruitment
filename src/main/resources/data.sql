  INSERT INTO `category` VALUES (1,'first category','3');
  INSERT INTO `category` VALUES (2,'seconde category','3');
  INSERT INTO `category` VALUES (3,'third category','3');
  INSERT INTO `category` VALUES (4,'forth category','3');
  INSERT INTO `category` VALUES (5,'six category','3');
  INSERT INTO `category` VALUES (6,'seven category','3');
  INSERT INTO `location` VALUES (1,'first location','3');
  INSERT INTO `location` VALUES (2,'seconde location','3');
  INSERT INTO `location` VALUES (3,'third location','3');
  INSERT INTO `location` VALUES (4,'six location','3');
  INSERT INTO `location` VALUES (5,'seven location','3');
  
  INSERT INTO `candidat`(`id`, `mail`, `name`, `password`, `sexe`, `status`, `surename`) 
  VALUES (1,'thisismail@gmail.com','imed','password','Male','ACTIVE','zenned');
  
  INSERT INTO `candidat`(`id`, `mail`, `name`, `password`, `sexe`, `status`, `surename`) 
  VALUES (2,'thisisomar@gmail.com','omar','password','Male','ACTIVE','bounamcha');
  
  INSERT INTO `candidat`(`id`, `mail`, `name`, `password`, `sexe`, `status`, `surename`) 
  VALUES (3,'johnsnow@gmail.com','john','password','Male','ACTIVE','snow');
  
  INSERT INTO `candidat`(`id`, `mail`, `name`, `password`, `sexe`, `status`, `surename`) 
  VALUES (4,'leviackerman@gmail.com','levi','password','Male','ACTIVE','ackerman');
  
  INSERT INTO `candidat`(`id`, `mail`, `name`, `password`, `sexe`, `status`, `surename`) 
  VALUES (5,'MonkeyDLuffy@gmail.com','MonkeyD','password','Male','ACTIVE','Luffy');
  
  INSERT INTO `candidat`(`id`, `mail`, `name`, `password`, `sexe`, `status`, `surename`) 
  VALUES (6,'RoronoaZoro@gmail.com','Roronoa','password','Male','ACTIVE','Zoro');
  
    INSERT INTO `candidat`(`id`, `mail`, `name`, `password`, `sexe`, `status`, `surename`) 
  VALUES (7,'NicoRobin@gmail.com','Nico','password','Female','ACTIVE','Robin');
  
  
  INSERT INTO `client`(`id`, `adresse`, `description`, `is_engage`, `mail`, `name`, `password`, `secteur`, `status`) 
  VALUES (1,'Speed of Sound','Known to many as the man with the most redundant name ever, Speed of Sound, or Sonic for brevity',1,'Speed of Sound@gmail.com','Sonic','Sonic','Speed of Sound','VALIDE');
  
  INSERT INTO `client`(`id`, `adresse`, `description`, `is_engage`, `mail`, `name`, `password`, `secteur`, `status`) 
  VALUES (2,'Demon Cyborg','Genos is a cyborg who works together with his professor to find out who attacked his town and killed his whole family',1,'DemonCyborg@gmail.com','Demon','Demon','Speed of Sound','VALIDE');

  
  INSERT INTO `offre`(`id`, `date_limit`, `description`, `details`, `edu_level`, `experience`,  `salary`, `status_offre`, `tags`, `title`, `type`, `category_id`,  `location_id`) 
         VALUES (1,'2019-10-7','this is a description and stuff of this offre','this is a details and other stuff of this offre','Bac + 3',1,2500,1,'snapTag','offre title','chosen type',1,1);

         INSERT INTO `offre`(`id`, `date_limit`, `description`, `details`, `edu_level`, `experience`,  `salary`, `status_offre`, `tags`, `title`, `type`, `category_id`,  `location_id`) 
         VALUES (2,'2019-9-8','this is a  stuff of this offre description','this other stuff of this offre is a details and ','Bac',0,700,1,'snapTag','warmUp title','some type',1,2);

         INSERT INTO `offre`(`id`, `date_limit`, `description`, `details`, `edu_level`, `experience`,  `salary`, `status_offre`, `tags`, `title`, `type`, `category_id`,  `location_id`) 
         VALUES (3,'1997-7-6','this is a  dummies data for this offre description','saw respect females old. Civilly why how end viewing attempt related enquire visitor. Man particular insensible celebrated conviction ','Bac',1,700,1,'celebrated','Civilly why','visitor',2,1);

         INSERT INTO `offre`(`id`, `date_limit`, `description`, `details`, `edu_level`, `experience`,  `salary`, `status_offre`, `tags`, `title`, `type`, `category_id`,  `location_id`) 
         VALUES (4,'2019-6-23','Sentiments two occasional affronting','Windows talking painted pasture','Bac + 1',2,1000,1,'Sentiments','Sentiments title','visitor',2,2);

  
  INSERT INTO `offre`(`salary`, `id`, `description`,  `title`, `type`) VALUES (2000,6,'this is an offre description','title offre 01','type1');
  INSERT INTO `offre`(`salary`,`id`, `description`,  `title`, `type`) VALUES (1200,7,'offre 15 description','new title','type1');
  INSERT INTO `offre`(`salary`,`id`, `description`,  `title`, `type`) VALUES (500,8,'boom another offre to add','some offre','is this souce');
  INSERT INTO `offre`(`salary`,`id`, `description`,  `title`, `type`) VALUES (3000,9,'offre number 23','offre number 23','type of stuff');
  
