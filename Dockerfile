FROM websphere-liberty
COPY server.xml /config/
COPY keystore.xml /config/configDropins/defaults/
ADD target/CustomerDetails-0.0.1-SNAPSHOT.war /config/dropins/CustomerDetails.war
