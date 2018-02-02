FROM websphere-liberty
COPY wlp/server.xml /config/
COPY wlp/keystore.xml /config/configDropins/defaults/
ADD target/CustomerDetails-0.0.1-SNAPSHOT.war /config/dropins/CustomerDetails.war
