package org.orcid.jaxb.model.v3.rc1.record.summary;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;

@XmlRootElement(name = "invited-positions", namespace = "http://www.orcid.org/ns/activities")
@ApiModel(value = "InvitedPositionsV3_0_rc1")
public class InvitedPositions extends Affiliations<InvitedPositionSummary> implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -971081268464161201L;

    public InvitedPositions() {

    }
    
    public InvitedPositions(Collection<AffiliationGroup<InvitedPositionSummary>> groups) {
        super();
        this.groups = groups;
    }

    public Collection<AffiliationGroup<InvitedPositionSummary>> getInvitedPositionGroups() {
        if (this.groups == null) {
            this.groups = new ArrayList<AffiliationGroup<InvitedPositionSummary>>();
        }
        return (Collection<AffiliationGroup<InvitedPositionSummary>>) this.groups;
    }

    @Override
    public Collection<AffiliationGroup<InvitedPositionSummary>> retrieveGroups() {
        return getInvitedPositionGroups();
    }
}
