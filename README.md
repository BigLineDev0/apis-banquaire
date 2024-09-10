PROJET  WEBSERVICES DEVELOPPEMENT API-BANQUAIRE

EQUIPE : 

Aliou DIALLO  - INE : N00AC1320181

Assane KA - INE : N0019DD20181

Partie 3 : Évaluation et Comparaison

1.	Comparaison des services REST et SOAP en termes de performance, de facilité d’implémentation et d’interfaçage

CRITERE 	REST	SOAP
Performance	- Plus léger et rapide.
- Utilise des formats comme JSON ou XML.
- Moins gourmand en bande passante.	- Plus lourd en raison du format XML standardisé.
- Nécessite plus de bande passante pour la communication.
- Peut être plus lent en raison de sa complexité.
Facilité d’implémentation	- Facile à mettre en œuvre et à déployer.
- Moins de règles strictes, donc plus flexible.
- Requiert moins de configuration.	- Plus complexe à implémenter en raison des standards stricts.
- Requiert des outils spécifiques pour la configuration (WSDL, WS-Security).
Interfaçage	- Compatible avec presque toutes les plateformes et langages modernes (JavaScript, Python, PHP, etc.).
- Plus facile à consommer avec des Framework modernes.
- Supporté par presque tous les navigateurs via AJAX.	- Interopérabilité élevée grâce aux standards bien définis.
- Requiert des bibliothèques dédiées pour l'intégration.
- Plus adapté à des environnements d'entreprise lourds comme Java et .NET.

2. Avantages et inconvénients de chaque approche (REST vs SOAP) dans le contexte d’une banque en ligne
   
REST : Avantages
Simplicité et légèreté : REST est plus simple à implémenter et nécessite moins de bande passante, ce qui est utile pour les applications mobiles ou les clients à faible connexion.
Scalabilité : REST utilise un format léger comme JSON, ce qui permet à l'application de banque en ligne de se développer et de supporter un plus grand nombre d'utilisateurs sans compromettre les performances.
Flexibilité des formats de données : REST permet d’utiliser différents formats (JSON, XML, HTML, etc.), ce qui le rend plus flexible selon les besoins de l’application.

REST : Inconvénients
Sécurité : Bien que REST puisse implémenter HTTPS et OAuth pour sécuriser les communications, il ne possède pas de standards de sécurité aussi robustes que SOAP (comme WS-Security).
Manque de standardisation : REST est flexible, mais cela peut aussi entraîner une implémentation incohérente entre différents services.
SOAP : Avantages
Sécurité avancée : SOAP possède des standards de sécurité robustes (WS-Security) qui assurent une protection accrue des transactions bancaires en ligne.
Transactions complexes : SOAP est plus adapté pour des environnements nécessitant des transactions sécurisées, complexes et distribuées, comme le traitement des paiements ou des transferts de fonds.
Fiabilité : SOAP supporte des protocoles comme WS-ReliableMessaging, ce qui garantit que les messages sont livrés dans un ordre spécifique et sans perte de données.

SOAP : Inconvénients
Complexité : SOAP est plus difficile à configurer et à maintenir en raison de sa lourdeur et de ses standards stricts, ce qui peut ralentir le développement et augmenter les coûts.
Consommation de bande passante : Le format XML utilisé par SOAP est plus verbeux que JSON, entraînant une augmentation de la consommation de bande passante, ce qui peut être un inconvénient pour une banque en ligne avec un grand volume de requêtes.

Conclusion
REST est souvent préféré pour des applications bancaires nécessitant des performances élevées, une compatibilité avec des clients variés (mobile, web) et une mise en œuvre rapide.
SOAP est plus adapté aux transactions bancaires complexes qui nécessitent des niveaux de sécurité et de fiabilité élevés, bien qu'il soit plus lourd et plus complexe à implémenter.
L'approche choisie dépendra donc des besoins spécifiques de la banque en ligne, comme la sécurité, la performance ou la compatibilité.