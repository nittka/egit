 * Copyright (C) 2012, 2013 IBM Corporation and others.
import org.junit.Before;
	private File gitDir;

	@Before
	public void setup() throws Exception {
		gitDir = createProjectAndCommitToRepository();
		CommitOperation cop = new CommitOperation(commitables,
				Arrays.asList(commitables), TestUtil.TESTAUTHOR,
				TestUtil.TESTCOMMITTER, "Initial commit");
	public void tearDown() throws Exception {
		deleteAllProjects();
		shutDownRepositories();
		FileUtils.delete(gitDir.getParentFile(), FileUtils.RECURSIVE
				| FileUtils.RETRY);
		LocationPage locationPage = createPatchWizard.getLocationPage();
		locationPage.selectClipboard();
		createPatchWizard.finishWithNoneFormat();
		createPatchWizard.finishWithNoneFormat();
		createPatchWizard.finishWithNoneFormat();