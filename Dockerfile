FROM websphere-liberty
ADD target/CustomerDetails-0.0.1-SNAPSHOT.war /config/dropins/CustomerDetails.war
