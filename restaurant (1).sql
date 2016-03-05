-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Lun 25 Janvier 2016 à 13:29
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `restaurant`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `cin` varchar(8) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `tel` int(10) NOT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`cin`, `nom`, `prenom`, `tel`) VALUES
('00000000', 'jouini', 'aladin', 0),
('09510910', 'guesmi', 'hachem', 54349839),
('09510913', 'azizi', 'mahdi', 12457836);

-- --------------------------------------------------------

--
-- Structure de la table `detailscommande`
--

CREATE TABLE IF NOT EXISTS `detailscommande` (
  `numCommande` int(11) NOT NULL,
  `numElement` int(11) NOT NULL,
  `quantite` int(11) NOT NULL,
  PRIMARY KEY (`numCommande`,`numElement`),
  KEY `f8_idx` (`numElement`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE IF NOT EXISTS `facture` (
  `num` int(11) NOT NULL,
  `numCommande` int(11) DEFAULT NULL,
  `prix` int(11) NOT NULL,
  PRIMARY KEY (`num`),
  KEY `f7_idx` (`numCommande`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE IF NOT EXISTS `fournisseur` (
  `cin` varchar(8) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `tel` int(11) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `fournisseur`
--

INSERT INTO `fournisseur` (`cin`, `nom`, `prenom`, `tel`, `email`) VALUES
('12345678', 'jandoubi', 'marwen', 22352643, 'jandoubi.marwen@gmail.com'),
('45678912', 'dhawedi', 'narimene', 98554556, 'dhawedi.narimene@yahoo.com'),
('98765432', 'hammemi', 'hana', 21365498, 'hammemi.hana@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `menu`
--

CREATE TABLE IF NOT EXISTS `menu` (
  `num` int(11) NOT NULL,
  `type` varchar(20) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prix` int(11) NOT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE IF NOT EXISTS `produit` (
  `num` int(11) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `unite` varchar(11) DEFAULT NULL,
  `quantite` int(11) DEFAULT NULL,
  `quantiteMin` int(11) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `produit`
--

INSERT INTO `produit` (`num`, `nom`, `unite`, `quantite`, `quantiteMin`) VALUES
(1, 'tomate', 'kilo', 10, 10),
(2, 'choux', 'unite', 9, 10),
(3, 'fromage', 'kilo', 50, 10),
(4, 'poisson', 'kilo', 50, 10),
(5, 'viande', 'kilo', 50, 10),
(6, 'farine', 'kilo', 50, 10),
(7, 'oeuf', 'plateau', 50, 10),
(8, 'huile', 'litre', 50, 10),
(9, 'boisson', 'bouteille', 200, 40);

-- --------------------------------------------------------

--
-- Structure de la table `produitfournisseur`
--

CREATE TABLE IF NOT EXISTS `produitfournisseur` (
  `numF` varchar(8) NOT NULL,
  `numP` int(11) NOT NULL,
  `prix` float DEFAULT NULL,
  PRIMARY KEY (`numF`,`numP`),
  KEY `f14_idx` (`numP`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `produitfournisseur`
--

INSERT INTO `produitfournisseur` (`numF`, `numP`, `prix`) VALUES
('12345678', 1, 1),
('12345678', 2, 30),
('45678912', 1, 2),
('45678912', 3, 50),
('98765432', 2, 29),
('98765432', 3, 50);

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE IF NOT EXISTS `reservation` (
  `num` int(11) NOT NULL AUTO_INCREMENT,
  `jour` varchar(15) NOT NULL,
  `heure` varchar(15) NOT NULL,
  `nombreTable` int(11) NOT NULL,
  `nombrePersonne` int(11) NOT NULL,
  `cin` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`num`),
  KEY `f1_idx` (`cin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

-- --------------------------------------------------------

--
-- Structure de la table `table`
--

CREATE TABLE IF NOT EXISTS `table` (
  `num` int(11) NOT NULL,
  `etat` varchar(20) NOT NULL DEFAULT 'disponible',
  `cin` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`num`),
  KEY `f11_idx` (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `table`
--

INSERT INTO `table` (`num`, `etat`, `cin`) VALUES
(1, 'disponible', '11111111'),
(2, 'disponible', '11111111'),
(3, 'disponible', '22222222'),
(4, 'disponible', '22222222'),
(5, 'disponible', '11111111'),
(6, 'disponible', '11111111'),
(7, 'disponible', '22222222'),
(8, 'disponible', '22222222'),
(9, 'disponible', '33333333'),
(10, 'disponible', '33333333'),
(11, 'disponible', '44444444'),
(12, 'disponible', '44444444'),
(13, 'disponible', '33333333'),
(14, 'disponible', '33333333'),
(15, 'disponible', '44444444'),
(16, 'disponible', '44444444');

-- --------------------------------------------------------

--
-- Structure de la table `tableclient`
--

CREATE TABLE IF NOT EXISTS `tableclient` (
  `numReservation` int(11) NOT NULL DEFAULT '0',
  `numTable` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numReservation`,`numTable`),
  KEY `f4_idx` (`numTable`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE IF NOT EXISTS `utilisateur` (
  `cin` varchar(8) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `tel` varchar(10) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `utilisateur`
--

INSERT INTO `utilisateur` (`cin`, `nom`, `prenom`, `tel`, `login`, `password`, `role`) VALUES
('09123456', 'jouini', 'aladin', '41629076', 'noway', 'azerty123', 'Gerant'),
('09510910', 'guesmi', 'hachem', '54349839', 'hachem', '1234', 'Receptionniste'),
('11111111', 'derbali', 'med amin', '98112233', 'derbali', '1111', 'Serveur'),
('12345678', 'guesmi', 'afif', '98687465', 'afif', '0000', 'Chef cuisinier'),
('22222222', 'guesmi', 'sami', '65987321', 'sami', '2222', 'Serveur'),
('33333333', 'chabchoub', 'imed', '23456789', 'imed', '3333', 'Serveur'),
('44444444', 'hammemi', 'mourad', '121365478', 'mourad', '4444', 'Serveur');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `detailscommande`
--
ALTER TABLE `detailscommande`
  ADD CONSTRAINT `f8` FOREIGN KEY (`numElement`) REFERENCES `menu` (`num`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `f9` FOREIGN KEY (`numCommande`) REFERENCES `commande` (`num`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Contraintes pour la table `facture`
--
ALTER TABLE `facture`
  ADD CONSTRAINT `f7` FOREIGN KEY (`numCommande`) REFERENCES `commande` (`num`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `produitfournisseur`
--
ALTER TABLE `produitfournisseur`
  ADD CONSTRAINT `f13` FOREIGN KEY (`numF`) REFERENCES `fournisseur` (`cin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `f14` FOREIGN KEY (`numP`) REFERENCES `produit` (`num`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `f1` FOREIGN KEY (`cin`) REFERENCES `client` (`cin`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `table`
--
ALTER TABLE `table`
  ADD CONSTRAINT `f11` FOREIGN KEY (`cin`) REFERENCES `utilisateur` (`cin`) ON DELETE SET NULL ON UPDATE CASCADE;

--
-- Contraintes pour la table `tableclient`
--
ALTER TABLE `tableclient`
  ADD CONSTRAINT `f4` FOREIGN KEY (`numTable`) REFERENCES `table` (`num`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `f5` FOREIGN KEY (`numReservation`) REFERENCES `reservation` (`num`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
