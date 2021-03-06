package org.orcid.jaxb.model.record.summary_rc1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.record_rc1.Group;
import org.orcid.jaxb.model.record_rc1.GroupableActivity;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "identifiers", "peerReviewSummary" })
@XmlRootElement(name = "peer-review-group", namespace = "http://www.orcid.org/ns/activities")
public class PeerReviewGroup implements Group, Serializable {
    private static final long serialVersionUID = 1L;
    @XmlElement(name = "identifiers", namespace = "http://www.orcid.org/ns/activities")
    private Identifiers identifiers;
    @XmlElement(name = "summary", namespace = "http://www.orcid.org/ns/peer-review")
    private List<PeerReviewSummary> peerReviewSummary;

    public Identifiers getIdentifiers() {
        if (identifiers == null)
            identifiers = new Identifiers();
        return identifiers;
    }

    public List<PeerReviewSummary> getPeerReviewSummary() {
        if (peerReviewSummary == null)
            peerReviewSummary = new ArrayList<PeerReviewSummary>();
        return peerReviewSummary;
    }
    
    @Override
    public Collection<? extends GroupableActivity> getActivities() {
        return getPeerReviewSummary();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((peerReviewSummary == null) ? 0 : peerReviewSummary.hashCode());
        result = prime * result + ((identifiers == null) ? 0 : identifiers.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PeerReviewGroup other = (PeerReviewGroup) obj;
        if (peerReviewSummary == null) {
            if (other.peerReviewSummary != null)
                return false;
        } else if (!peerReviewSummary.equals(other.peerReviewSummary))
            return false;
        if (identifiers == null) {
            if (other.identifiers != null)
                return false;
        } else if (!identifiers.equals(other.identifiers))
            return false;
        return true;
    }

}
