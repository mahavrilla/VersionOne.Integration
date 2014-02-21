package com.versionone.git;
import org.eclipse.jgit.revwalk.RevCommit;

public class ReviewedRevision{
	public String branchName;
	public RevCommit revCommit; 

	public ReviewedRevision(RevCommit commit) {
		this.revCommit = commit;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branch) {
		this.branchName = branch; 
	}
}