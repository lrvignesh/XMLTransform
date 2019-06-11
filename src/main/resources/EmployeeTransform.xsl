<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xalan="http://xml.apache.org/xslt">

	<xsl:output method="xml" encoding="ASCII" indent="yes" xalan:indent-amount="4" />
	<xsl:strip-space elements="*" />

	<xsl:template match="/">

		<CurrentEmployees>

			<xsl:for-each select="Employees/Employee">
				<Candidate>
					<CandidateID>
						<xsl:value-of select="id"></xsl:value-of>
					</CandidateID>
					<CandidatePreferredLocation>
						<xsl:value-of select="city"></xsl:value-of>
					</CandidatePreferredLocation>
					<CandidateProfessionalName>
						<xsl:value-of select="name"></xsl:value-of>
					</CandidateProfessionalName>
				</Candidate>
			</xsl:for-each>

		</CurrentEmployees>

	</xsl:template>
</xsl:stylesheet>